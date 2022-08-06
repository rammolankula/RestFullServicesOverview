# RestFullServicesOverview
#### 1.what is Webservices?
##### i)web services is concept of linking between two or More applications which are running or same server or different server 
##### ii)Communication between server to server
##### iii)Here we used protocall HTTP Json/XML
![Rest Web Architecture](https://user-images.githubusercontent.com/53596726/175813595-664761ec-bf76-46d5-81c3-ccb4beef2428.png)

#### 2.Web services Types?
##### SOAP-->Service Oriented Architecture
##### REST-->Representational State Transfer

#### SOAP-->Service Oriented Architecture
##### service oriented architecture has three components
##### 1)Service provider 
##### 2)service consumer
##### 3)service register
##### As well it has three operations i)PUBLISH ii)FIND iii)BIND
##### PUBLISH:::::::-The operation which is generates on API DOCUMENTS in xml formats is called (WSDL) web services description languages and its in placed in Service Register (UDDI)universal Description and Discovery integrits
##### FIND:::::::::::- The Operation is made by the consumer that will communicate with Service Register get one document (by using the address URL using this document equal code files are generated which are called as staff.
##### BIND:::::::::::- it makes the communication between the skeletopn and stubs by using HTTP protocal and xml data forma
##### Marshalling and Unmarshalling
##### Marshalling and Unmarshalling is nothing but serillaization and Deserillaization 
##### Coverting XML to Object
##### Coverting Object to XML
##### Coverting object to the xml
##### Coverting xml to the object
###### HTTP supoorts the two types of the protocals 
###### 1)Request
###### 2)Response
###### Rest cp with FC
###### IL to IL IntegrationLayer to IntegrationLayer communication is done by http+json data format
###### it supports xml format and it supports json also but mostly we are using json because it light weighted compare to xml and json less memory consumeable.
###### JSON full form JAVA SCRIPT OBJECT NOTATION
###### json object we are use in the form of javascript syntax
###### {
###### "name:"Ram",
###### "id":1
###### }
##                                            SPRING BOOT REST DESIGN
### REST: REPRESENTATIONAL STATE TRANSFER
###### Representational state transfer it means exchaning the data in global format(JSON/XML) it uses http protocal it like architecture or design.
###### REPRESENTATIONAL::: view/show(URL)
###### STATE:::::::::::::: METHOD/FORMAT
##### TRANSFER:::::::::::: REQUEST/RESPONSE
#### PRODUCER AND CONSUMER EXCUTION FLOW OF REQUEST AND RESPONSE
##### 1)Define one path (URL) consumer app
##### 2)create object to RestTemplate (NOt given by Auto Configuration)
##### 3)Use one method (POST/GET.....etc) and other inputs
##### 4)Request is received at producer FC(FrontEnd Controller)
##### 5)On RestController method is called by FC using   PATH and METHODTYPE
##### 6)After Executimg the Restcontroller that returns the ResponseEntity that contains Body https Status
##### 7)Response given back to FC
##### 8)Same Response Send to consumer
##### 9)Consumer reads the body and status
##### 10)consumer may use/print details.
![Rest-Architecture](https://user-images.githubusercontent.com/53596726/180641703-949d631a-641e-4d35-869a-77ace408cb7b.png)

## Example 2::
##### Here Define one public class (Spring boot container should able to access with an annotation @Restcontroller
##### RestController is a Combination of @CONTROLLER + @RESPONSEBODY
##### @Controller supports local
##### @ResponseBody return type data is converted into xml and Json format
##### Recommanded Return Type is ResponseEntity, its supports Sending Data,HTTP headers and status information...etc give to consumer
##### RESPONSEENTITY should have basic information like (Response Body and HttpStatus(Enum)
##### ResponseEntity(Body,Status)
##### Request is an input data type xml/json is converted into object format as given method param is Restcontroller
##### Restcontroller returns one Object is converted into xml/json format and given as output client machine
### REST: REPRESENTATIONAL STATE TRANSFeR
##### Below i wrote two type of methods returning with responseEntity and method returning without ResposneEntity
##### ResponseEntity ReturnS the Msg or Response along with the STATUS with the help og HTTPSTATUS and it is serilaized into ResponseBody
##### ResponseBody is Nothing but returning the Response without status of the Response and it is serilaized into ResponseBody of HTTP Response
##### Here worked
##### Printing MESSAGE By using ResponseEntity & ResponseBody
##### Printing OBJECT By using ResponseEntity & ResponseBody
##### Printing LIST OF OBJECTS By using ResponseEntity & ResponseBody

### @REQUESTBODY
#### This Annotation is used to read the HTTP-Request Body data and it is convert into Object Request format is finally given as RestController #Method Param
### 1)What is the difference between @ModelAttribute and @RequestBody?
#### @ModelAttribute:: HTML/Thymeleaf Form---->Object(Spring Mvc)
#### @RequestBody::::: JSON/XML -------------->Object(Spring Rest)
#### @RequestBody::::: RequestBody will check first ContentType:Header Param based on contentType,it decides that response body contains that data
#### if Request is sending in XML which is not supported by Spring APP then HTTP STATUS IS 415 NotSupported by Boot App
#### if Request is made for xml output using accept header param but xml dependency not exist then HTTP status will 416 NOTACCEPTABLE(RESPONSE EXPECTED AS XML)
#### This Example code will be there at TestJXcontroller.java class


# CLIENT SIDE ERRORS 4XX
### 400 - BAD REQUEST:-client input is wrong 
### 401 - UNAUTHORIZED:- clinet login credentials (UN/PASSWORD) are wrong
### 403 - FORBIDDEN:- client login in user,trying to access Admin Services (INVALID ROLES)
### 404 - NOTFOUND:- client Request URL is not Matched with any controller #method PATH
### 405 - METHOD NOT ALLOWED:-client Request URL is matched,but request HTTP METHOD type is not matched with controller type
### 406 - NOT ACCEPTABLE:Client is requested for one data format (Ex:xml) as response dependency conversion is not exist
### 407 - UNSUPPORTED MEDIA TYPE:Client is sending request with body having global dat format (EX:xml)but dependency for conversion is not exist
#  SUCCESS CODES
### 200 - Request processed successfully without any exception
### 201 - CREATED: use only for post type Request [new Resource is created at server] EXAMPLE:User created successfully
### 202 - ACCEPTED: if response contains matching type for "accept" ____"header" param given by request then status 202 Accepted
### 204 - Request processed succesfully but no output [Empty ResponseBody]

#### Use Symbol "?" at controller ResponseEntity type
####  "?" type is decided based on condition at runtime
#### Same as like below example
#### ResponseEntity,---->types if String or Object and conditions will there at that time we need to use "?"
#### Example code code there SymbolResponse.java classa
![ResponseEntityType](https://user-images.githubusercontent.com/53596726/183253419-bbf3c405-ae89-43a6-b509-074e5de8d6ab.png)

### ResponseEntity Status
#### use ResponseEntity  to pass the HTTP status value this is one ENUM (Set of possible values) programmes works 
#### * ResponseEntity works on 3 types of Statuses
#### * A)Client side errors(4xx)
#### * B)Server side errors(5xx)
#### * C)Success Message(2XX)
#### *For this Example there in code HTTPSTATUS.JAVA controller class


# PASS PRIMITTIVE INPUTS
#### A) RequestParameter (URL:KEY:VAL) is uses for SPRING-MVC
#### B) @PathVariable(URL/PATH/DATA....) is uses for SPRING[REST+UI]
#### STATICPATH: /path Example:/save./all...etc
#### DYNAMICPATH: /{key}, it indicates a value comes at runtime and binded to this Key
#### /fetch is static path we need to provide same path in client but in case /{id} need to pass one dynamic value
#### This value gets memory in container from there we need to read if in controller using below syntax
#### @Pathvariable("key") DataType localvariable
#### @PathVariable DataType key
#### Notes
#### Note 1: No key is Required while sending the data using Request
#### Note 2: Incase of sending Multiple param order must be followed
#### Note 3: While reading the controller key is required,must specify in URL(Path) as dynamic{key}
#### Note 4: PathVariable are required inputs (not optional) atleast we need to send dummy value
#### C)**** IF two methods are exist with same level one with STATIC and another is DYNAMIC then priority is given to more static count
#### Example :: /find/data ---> M1
####           /find/{data} ---> M2
#### Req:- Request Always goes to the FirstMethod]
#### This Example code there in Pathvaribale.java class


