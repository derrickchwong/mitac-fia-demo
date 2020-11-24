

Use KP command to create Docker image with source code in localhost
```
kp image create mitac-fia-demo --tag <repo>/mitac-fia-demo:0.0.1-SNAPSHOT --local-path .
```

Check the log of image build
```
kp build logs mitac-fia-demo
```

Use KP command to update Docker image with source code in localhost
```
kp image patch mitac-fia-demo --local-path .
```

Use KP command to create Docker image by git commit 
```
kp image create mitac-fia-demo --tag <repo>/mitac-fia-demo:0.0.1-SNAPSHOT --git <git repo path>
```

Create K8s deploy 
```
kubectl apply -f deploy.yml
```

Create K8s LoadBalancer service
```
kubectl expose deploy/mitac-fia-demo --port 8080 --type LoadBalancer
```