<p align="center">
  <img src="https://raw.githubusercontent.com/crichmond1989/hellonetcore/master/README.logo.png" />
</p>

[![Build Status](https://api.travis-ci.org/crichmond1989/hellonetcore.png?branch=master)](https://travis-ci.org/crichmond1989/hellonetcore)

# Hello .NET Core

An introduction to VirtualBox, Ubuntu, .NET Core, and Docker!

## Environment
VirtualBox
* [Download Page](https://www.virtualbox.org/wiki/Downloads)
* [Direct EXE Link](https://download.virtualbox.org/virtualbox/5.2.8/VirtualBox-5.2.8-121009-Win.exe)

Ubuntu 16.04.4 LTS
* [Download Page](https://www.ubuntu.com/download/desktop)
* [Direct ISO Link](https://www.ubuntu.com/download/desktop/thank-you?country=US&version=16.04.4&architecture=amd64)

.NET Core SDK
* [Installation Instructions](https://www.microsoft.com/net/download/linux-package-manager/ubuntu16-04/sdk-current)

Visual Studio Code
* [Download Page](https://code.visualstudio.com/Download)
* [Direct Debian Link](https://code.visualstudio.com/docs/?dv=linux64_deb)

Docker
* [DigitalOcean Guide](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-16-04)

## Development
Build - [DotNet Restore](https://docs.microsoft.com/en-us/dotnet/core/tools/dotnet-restore?tabs=netcore2x)
```bash
dotnet restore
```

Run - [DotNet Run](https://docs.microsoft.com/en-us/dotnet/core/tools/dotnet-run?tabs=netcore2x)
```bash
dotnet run {CLI_ARGS}
```

## Testing
Build - [Docker Build](https://docs.docker.com/engine/reference/commandline/build/)
```bash
docker build . -t crichmond1989/hellonetcore:test
```

Run - [Docker Run](https://docs.docker.com/engine/reference/commandline/run/)
```bash
docker run -i --rm crichmond1989/hellonetcore:test {CLI_ARGS}
```

Authenticate - [Docker Login](https://docs.docker.com/engine/reference/commandline/login/)
```bash
docker login {server}
```
* A token is stored until the user executes the `docker logout {server}` command.

Upload - [Docker Push](https://docs.docker.com/engine/reference/commandline/push/)
```bash
docker push crichmond1989/hellonetcore:test
```
* A Docker image name is typically a namespace/product pair, such as `microsoft/dotnet`.
  * Docker Cloud: {Docker_ID}/{product}
  * Azure: {Repository_Name}.azurecr.io/{product}
  
Download - [Docker Pull](https://docs.docker.com/engine/reference/commandline/pull/)
```bash
docker pull crichmond1989/hellonetcore:test
```

## Production
Tag - [Docker Tag](https://docs.docker.com/engine/reference/commandline/tag/)
```bash
docker tag crichmond1989/hellonetcore:test crichmond1989/hellonetcore:latest
```

Upload
```bash
docker push crichmond1989/hellonetcore:latest
```

Download
```bash
docker pull crichmond1989/hellonetcore:latest
```

Run
```bash
docker run -i --rm crichmond1989/hellonetcore:latest {CLI_ARGS}
```
