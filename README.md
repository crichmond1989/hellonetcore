# Hello .NET Core

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

## Staging
Build - [Docker Build](https://docs.docker.com/engine/reference/commandline/build/)
```bash
docker build . -t hellonetcore:test
```

Run - [Docker Run](https://docs.docker.com/engine/reference/commandline/run/)
```bash
docker run -i --rm hellonetcore:test {CLI_ARGS}
```

Upload - [Docker Push](https://docs.docker.com/engine/reference/commandline/push/)
```bash
docker push hellonetcore:test
```

## Production
Download - [Docker Pull](https://docs.docker.com/engine/reference/commandline/pull/)
```bash
docker pull hellonetcore:test
```

Run
```bash
docker run -i --rm hellonetcore:test {CLI_ARGS}
```