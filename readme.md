# Prerequisite
- ```docker should be installed on your local machine```
- ```docker desktop should be installed and required to follow-up; docker image creation, docker container creation and test logs via container terminal```

# Steps to run test
After cloning project into your local environment, you need
to build docker image and run the container for that image

## Apply below the steps for launching rest-assurred test project container
- Go to root directory of the project where Dockerfile is located and run following two commands in given order.
- ```docker build -t rest-assurred-test .```
- ```docker run -dp 127.0.0.1:8081:8081 rest-assurred-test```
- Go to container terminal via Docker Desktop and follow-up the logs produced for test run
