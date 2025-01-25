# Kafka POC

**Application to test the sending and receiving of messages through Kafka.**

In this first use case, a text string is sent through a REST HTTP request (POST). It is transmitted via a Kafka producer, which is picked up by the Kafka consumer and processed. In this case, as a test, the message is logged to the console.

---

## Requirements

### On Windows

You need to install the following:

1. **Download Kafka**
    - Download the binary version of Kafka from the official [Apache Kafka website](https://kafka.apache.org/downloads).
    - Select a stable version of Kafka, such as `kafka_2.13-3.9.0.tgz` (or a newer version if available).

2. **Extract Kafka**
    - After downloading the file (e.g., `kafka_2.13-3.9.0.tgz`), unzip it to a location of your choice. For example:
        - `C:\kafka`

## Steps to Start Kafka and ZooKeeper

### 1. Start ZooKeeper
- Open a terminal and navigate to the `bin/windows` directory of your Kafka installation.

  ```bash
  cd C:\kafka\bin\windows
  zookeeper-server-start.bat ../../config/zookeeper.properties
  ```
### 2. Start Kafka
- In a new terminal, navigate to the same directory and run the following
- 
  ```bash
  cd C:\kafka\bin\windows
  kafka-server-start.bat ../../config/server.properties
  ```
---
