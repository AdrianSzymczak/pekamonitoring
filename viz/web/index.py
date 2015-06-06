from flask import Flask, render_template
import pymongo
import json
import re

# Setup Flask
app = Flask(__name__)

# Setup Mongo
conn = pymongo.MongoClient('localhost', 27017)
db = conn.peka_db
collection = db['peka_details']
@app.route("/")
def dashboard():
	return render_template('index.html')

@app.route("/lines")
def lines():
	total = collection.count()
	lines = collection.aggregate([{"$group" : { "_id" : "$time.line", "count" : { "$sum": 1}}},{"$sort" : {"_id": 1}}])

	results = {}
	results['keys'] = 'line', 'count' 
	results['values'] = [[i['_id'], i['count']] for i in lines]
	return render_template('lines.html', results=results)

@app.route("/stops/<line>")
def stops(line):
	stops = collection.aggregate([{"$match": {"time.line": line}},{"$group" : { "_id" : "$bollard.name", "count" : { "$sum": 1}}},{"$sort" : {"_id": 1}}])
	
	results = {}
	results['keys'] = 'name', 'count'
	results['values'] = [[i['_id'], i['count']] for i in stops]
	results['line'] = line
	return render_template('stops.html', results=results)

@app.route("/stops/<line>/<stop>/all")
def stop(line, stop):
	stop = collection.find({"time.line": str(line), "bollard.name": str(stop)})
	
	results = {}
	results['keys'] = ['details']
	results['values'] = [[i] for i in stop]
	return render_template('stop_all.html', results=results)

@app.route("/stops/<line>/<stop>")
def stop_graph(line, stop):
	minutes = collection.aggregate([{"$match": {"time.line": str(line), "bollard.name": str(stop)}}, {"$group": {"_id": "$time.minutes", "count": {"$sum": 1}}},{"$sort" : {"_id": 1}}])
	# minutes = collection.aggregate([{"$match": {"time.line": str(line)}},{"bollard.name": str(stop)}}, {"$group": {"_id": "times.minutes", "count": {"$sum": 1}}}])

	results = {}
	results['keys'] = 'minutes', 'count'
	results['values'] = [[i['_id'], i['count']] for i in minutes]
	results['line'] = line
	results['stop'] = stop
	return render_template('stop_graph.html', results=results)
if __name__ == "__main__":
  app.run(debug=True)


