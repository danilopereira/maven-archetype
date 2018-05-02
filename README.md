# Clickbus Microservices Maven Archetype

## Adding Archetype to your local repository
```sh
$ git clone https://github.com/danilopereira/maven-archetype.git
$ cd maven-archetype
$ mvn clean install
```
## Generating project from archetype
```sh
$ mvn archetype:generate \
     -DarchetypeGroupId=com.clickbus.platform \
     -DarchetypeArtifactId=clickbus-platform-maven-archetype \
     -DarchetypeVersion=1.0.0-SNAPSHOT \
     -DgroupId=com.clickbus.platform \
     -DartifactId=your-project \
     -Dversion=1.0.0-SNAPSHOT \
     -DinteractiveMode=false
```
