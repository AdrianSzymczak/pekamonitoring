import sys
import pymongo
from pymongo import MongoClient
import json


client = MongoClient('localhost', 27017)
db = client['peka_db']
collection = db['peka_details']
# if collection.count() != 0:
# 	collection.drop()
# 	db.create_collection('peka_details')

for arg in sys.argv:
	if arg == sys.argv[0]:
		continue;
	num_lines = sum(1 for line in open(arg,'r'))

	count = 1;
	percentage_progress = 0;
	search_lines = open(arg,'r')
	for line in search_lines:
		count = count+1
		progress = count/float(num_lines)*100
		if percentage_progress != int(progress):
			print 'File: '+str(arg)+' '+str(percentage_progress)+'%'
			percentage_progress = int(progress)
		if not line.strip():
			continue
		success = line[26:33]
		if success == 'success':
			date = line[0:23]
			details = line[24:]
			details_json = json.loads(details)
			insert_row = {}
			insert_row['bollard'] = (details_json['success']['bollard'])
			insert_row['timestamp'] = date

			for time in details_json['success']['times']:
				insert_row['time'] = time
				collection.insert(insert_row)
				del insert_row['_id']
		if count == num_lines:
			print 'File: '+str(arg)+' 100% DONE'
print '...loading complete!'