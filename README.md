## Getting started

Execute the following in the Jennifer management screen.

 1. Extension & Notice > Adapter and Plugin
 2. Click the Add button.
 3. Select the 'XVIEW' type.
 4. Enter the 'xviewlog' ID.
 5. Enter the adapter path directly or upload the file.
 6. Enter the class 'com.aries.xviewlog.LogAdapter'.


## How to use Options

Adapter options are shown in the table below.

| Key           | Default Value |
| ------------- |:-------------:|
| pattern       | [%startTime, %endTime, %collectTime] Domain=%domainName(%domainId), Instance=%instanceName(%instanceId), TXID=%txid, Client IP=%clientIp, Client ID=%clientId, User ID=%userId, Response Time=%responseTime, Front-end Time=%frontendTime, Network Time=%networkTime, SQL Time=%sqlTime, Fetch Time=%fetchTime, CPU Time=%cpuTime, External-call Time=%externalcallTime, ERROR=%error, Application=%application |
| date_format   | HH:mm:ss |
| full_path | ../logs/xviewlog.%d{yyyy-MM-dd_HH}.log |
| rolling_mode | true |

If there is no option, the default value of the table is applied. Here's how to add an option:

<img width="887" alt="custom_key" src="https://user-images.githubusercontent.com/1277117/26880960-ff4ef69c-4bd0-11e7-93b6-185391351711.png">

<img width="887" alt="custom_key2" src="https://user-images.githubusercontent.com/1277117/26881100-66ae4298-4bd1-11e7-886b-851f4441fd0c.png">
 
 
## Supported version
 
Different versions of the server support different adapter versions.
 
| Adapter version           | Jennifer server version |
| ------------- |:-------------:|
| 1.0.0       | Greater than or equal to version 5.2.3 |
| 1.1.0       | Greater than or equal to version 5.4.0 |