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

@app.route("/stop/<name>")
def stop(name):
	stops = collection.aggregate([{"$match": {"time.line": name}},{"$group" : { "_id" : "$bollard.name", "count" : { "$sum": 1}}},{"$sort" : {"_id": 1}}])
	
	results = {}
	results['keys'] = 'name', 'count'
	results['values'] = [[i['_id'], i['count']] for i in stops]
	return render_template('stops.html', results=results)

if __name__ == "__main__":
  app.run(debug=True)


