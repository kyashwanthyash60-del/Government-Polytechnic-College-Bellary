# Week 11 – Docker Operations

Commands from the practical manual (run in Command Prompt or PowerShell where Docker Desktop is installed and running):

```bash
docker --version
docker images
docker pull ubuntu
docker pull python
docker pull mysql
docker pull openjdk
docker ps
docker ps -a
docker run -it ubuntu
docker run --name gptpython -it -d python
docker exec -it gptpython python
# At the Python prompt:
print("Hello FSD Lab")
docker run --name gptjava -it -d openjdk
docker exec -it gptjava jshell
// At the JShell prompt:
System.out.println("Hello FSD Lab");
docker run --name gptmysql -e MYSQL_ROOT_PASSWORD=user -d mysql
docker exec -it gptmysql bash
```

The manual also covers `docker build -t stud1ex .` to build an image from a Dockerfile. Replace sample passwords with secure values for real use. The manual contains a few command spelling/formatting errors; the commands above use valid Docker syntax.
