### Docker build:
```
docker build . -t january-chat-server
```
### Docker save built image in .tar file:
```
docker save -o target/dist/january-chat-server.tar chat-server
```
### Simple container run:
```
docker run -d --name january-chat-server january-chat-server
```
#### -add port forwarding:
```
-p 8189:8189
```