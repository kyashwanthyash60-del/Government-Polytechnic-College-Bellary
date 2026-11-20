# Program 18 – MongoDB CRUD commands

Run these commands in `mongosh` against a MongoDB server. The commands follow the practical manual and use the `student` collection.

```javascript
db.createCollection("student")
show collections
db.student.insert({"id":1,"name":"chandru","mark":300})
db.student.insertMany([
  {"id":1,"name":"chandru","mark":300},
  {"id":2,"name":"suman","mark":290}
])
db.student.find({})
db.student.update({"name":"chandru"},{$set:{"name":"sekar",id:5}})
db.student.deleteOne({"name":"sekar"})
```
