**Why gRPC?**

gRPC is a modern open source high performance RPC framework that can run in any environment. It can efficiently connect services in and across data centers with pluggable support for load balancing, tracing, health checking and authentication. It is also applicable in last mile of distributed computing to connect devices, mobile applications and browsers to backend services.

Simple service definition:
Define your service using Protocol Buffers, a powerful binary serialization toolset and language
Works across languages and platforms:
Automatically generate idiomatic client and server stubs for your service in a variety of languages and platforms
Start quickly and scale:
Install runtime and dev environments with a single line and also scale to millions of RPCs per second with the framework
Bi-directional streaming and integrated auth:
Bi-directional streaming and fully integrated pluggable authentication with HTTP/2-based transport

**On The Server We Have:**

proto files = human readable interface files to generate java stubs by maven plugin
java stubs = java abstract classes that will be used by us to implement our services
java service implementation = our implementation code for java stubs
gRPC server = a server that let communicate client and server
**On The Client We Have:**

java stubs = interfaces that can be called