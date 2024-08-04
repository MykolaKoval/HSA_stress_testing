# HSA stress testing homework
HSA homework to cover stress testing tools and approaches

Tools:
- [Siege](https://github.com/JoeDog/siege/)

System under test: exposed HTTP api to store request payload into MongoDB

<h3>Load testing results </h3>

Concurrent users: 10 <br/>
<img src="./images/load_c10.png" width="300">

Concurrent users: 25 <br/>
<img src="./images/load_c25.png" width="300">

Concurrent users: 50 <br/>
<img src="./images/load_c50.png" width="300">

Concurrent users: 100 <br/>
<img src="./images/load_c100.png" width="300">

Concurrent users: 250 <br/>
<img src="./images/load_c250.png" width="300">

JVM metrics collected <br/>
<img src="./images/jvm_metrics.png" width="600">