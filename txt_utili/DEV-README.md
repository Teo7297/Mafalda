to start mongodb: 			sudo mongod --dbpath=./mongodb  [--auth]      

auth: 					in the mongo shell use db.auth(user,pwd) to authenticate  ==> current admin "Teo"
					db.createUser(name, pwd) to add users

to connect and do manual queries: 	mongo --host <HOST> --port <PORT>
to change db: 				use <DB>  (default : test ; dbs created automatically: admin, config, local)
other stuff:				https://docs.mongodb.com/manual/mongo/

remember to use ip binding to bind mongodb to the trusted server ip

