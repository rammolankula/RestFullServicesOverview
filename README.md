# RestFullServicesOverview
#### 1.what is Webservices?
<pre>
&#8594; i)web services is concept of linking between two or More applications which are running or same server or different server 
&#8594; ii)Communication between server to server
&#8594; iii)Here we used protocall HTTP Json/XML
</pre>
![Rest Web Architecture](https://user-images.githubusercontent.com/53596726/175813595-664761ec-bf76-46d5-81c3-ccb4beef2428.png)

#### 2.Web services Types?
<pre>
&#8594; SOAP-->Service Oriented Architecture
&#8594; REST-->Representational State Transfer
</pre>
#### SOAP-->Service Oriented Architecture
##### service oriented architecture has three components
<pre>
&#8594; 1)Service provider 
&#8594; 2)service consumer
&#8594; 3)service register
</pre>
<pre>
 As well it has three operations i)PUBLISH ii)FIND iii)BIND
 PUBLISH:::::::-The operation which is generates on API DOCUMENTS in xml formats is called (WSDL) web services description languages and its in placed in Service Register (UDDI)universal Description and Discovery integrits
 FIND:::::::::::- The Operation is made by the consumer that will communicate with Service Register get one document (by using the address URL using this document equal code files are generated which are called as staff.
 BIND:::::::::::- it makes the communication between the skeletopn and stubs by using HTTP protocal and xml data forma
</pre>
##### Marshalling and Unmarshalling
<pre>
&#8594; Marshalling and Unmarshalling is nothing but serillaization and Deserillaization 
&#8594; Coverting XML to Object
&#8594; Coverting Object to XML
&#8594; Coverting object to the xml
&#8594; Coverting xml to the object
&#8594; HTTP supoorts the two types of the protocals 
&#8594; 1)Request
&#8594; 2)Response
&#8594; Rest cp with FC
&#8594; IL to IL IntegrationLayer to IntegrationLayer communication is done by http+json data format
&#8594; it supports xml format and it supports json also but mostly we are using json because it light weighted compare to xml and json less memory consumeable.
&#8594; JSON full form JAVA SCRIPT OBJECT NOTATION
&#8594; json object we are use in the form of javascript syntax
&#8594; {
&#8594; "name:"Ram",
&#8594; "id":1
&#8594; }
</pre>
##                                            SPRING BOOT REST DESIGN
<pre>
 REST: REPRESENTATIONAL STATE TRANSFER
Representational state transfer it means exchaning the data in global format(JSON/XML) it uses http protocal it like architecture or design.
REPRESENTATIONAL::: view/show(URL)
STATE:::::::::::::: METHOD/FORMAT
TRANSFER:::::::::::: REQUEST/RESPONSE
PRODUCER AND CONSUMER EXCUTION FLOW OF REQUEST AND RESPONSE
&#8594; 1)Define one path (URL) consumer app
&#8594; 2)create object to RestTemplate (NOt given by Auto Configuration)
&#8594; 3)Use one method (POST/GET.....etc) and other inputs
&#8594; 4)Request is received at producer FC(FrontEnd Controller)
&#8594; 5)On RestController method is called by FC using   PATH and METHODTYPE
&#8594; 6)After Executimg the Restcontroller that returns the ResponseEntity that contains Body https Status
&#8594; 7)Response given back to FC
&#8594; 8)Same Response Send to consumer
&#8594; 9)Consumer reads the body and status
&#8594; 10)consumer may use/print details.
 </pre>
![Rest-Architecture](https://user-images.githubusercontent.com/53596726/180641703-949d631a-641e-4d35-869a-77ace408cb7b.png)

## Example 2::
<pre>
 &#8594; Here Define one public class (Spring boot container should able to access with an annotation @Restcontroller
 &#8594; RestController is a Combination of @CONTROLLER + @RESPONSEBODY
 &#8594; @Controller supports local
 &#8594;  @ResponseBody return type data is converted into xml and Json format
 &#8594; Recommanded Return Type is ResponseEntity, its supports Sending Data,HTTP headers and status information...etc give to consumer
 &#8594; RESPONSEENTITY should have basic information like (Response Body and HttpStatus(Enum)
 &#8594; ResponseEntity(Body,Status)
 &#8594; Request is an input data type xml/json is converted into object format as given method param is Restcontroller
 &#8594; Restcontroller returns one Object is converted into xml/json format and given as output client machine
 :::::::::: REST: REPRESENTATIONAL STATE TRANSFeR
 &#8594; Below i wrote two type of methods returning with responseEntity and method returning without ResposneEntity
 &#8594; ResponseEntity ReturnS the Msg or Response along with the STATUS with the help og HTTPSTATUS and it is serilaized into ResponseBody
 &#8594; ResponseBody is Nothing but returning the Response without status of the Response and it is serilaized into ResponseBody of HTTP Response
 &#8594; Here worked
 &#8594; Printing MESSAGE By using ResponseEntity & ResponseBody
 &#8594; Printing OBJECT By using ResponseEntity & ResponseBody
 &#8594; Printing LIST OF OBJECTS By using ResponseEntity & ResponseBody
</pre>
### @REQUESTBODY
<pre>
&#8594;  This Annotation is used to read the HTTP-Request Body data and it is convert into Object Request format is finally given as RestController #Method Param
&#8594;  1)What is the difference between @ModelAttribute and @RequestBody?
&#8594;  @ModelAttribute:: HTML/Thymeleaf Form---->Object(Spring Mvc)
&#8594;  @RequestBody::::: JSON/XML -------------->Object(Spring Rest)
&#8594;  @RequestBody::::: RequestBody will check first ContentType:Header Param based on contentType,it decides that response body contains that data
&#8594;  if Request is sending in XML which is not supported by Spring APP then HTTP STATUS IS 415 NotSupported by Boot App
&#8594;  if Request is made for xml output using accept header param but xml dependency not exist then HTTP status will 416 NOTACCEPTABLE(RESPONSE EXPECTED AS XML)
&#8594;  This Example code will be there at TestJXcontroller.java class
</pre>

# CLIENT SIDE ERRORS 4XX
<pre>
&#8594; 400 - BAD REQUEST:-client input is wrong 
&#8594; 401 - UNAUTHORIZED:- clinet login credentials (UN/PASSWORD) are wrong
&#8594; 403 - FORBIDDEN:- client login in user,trying to access Admin Services (INVALID ROLES)
&#8594; 404 - NOTFOUND:- client Request URL is not Matched with any controller #method PATH
&#8594; 405 - METHOD NOT ALLOWED:-client Request URL is matched,but request HTTP METHOD type is not matched with controller type
&#8594; 406 - NOT ACCEPTABLE:Client is requested for one data format (Ex:xml) as response dependency conversion is not exist
&#8594; 407 - UNSUPPORTED MEDIA TYPE:Client is sending request with body having global dat format (EX:xml)but dependency for conversion is not exist
</pre>
#  SUCCESS CODES
<pre>
&#8594; 200 - Request processed successfully without any exception
&#8594; 201 - CREATED: use only for post type Request [new Resource is created at server] EXAMPLE:User created successfully
&#8594; 202 - ACCEPTED: if response contains matching type for "accept" ____"header" param given by request then status 202 Accepted
&#8594; 204 - Request processed succesfully but no output [Empty ResponseBody]
</pre>
<pre>
&#8594; Use Symbol "?" at controller ResponseEntity type
&#8594;  "?" type is decided based on condition at runtime
&#8594; Same as like below example
&#8594; ResponseEntity,---->types if String or Object and conditions will there at that time we need to use "?"
&#8594; Example code code there SymbolResponse.java classa
 </pre>
![ResponseEntityType](https://user-images.githubusercontent.com/53596726/183253419-bbf3c405-ae89-43a6-b509-074e5de8d6ab.png)

### ResponseEntity Status
<pre>
&#8594; use ResponseEntity  to pass the HTTP status value this is one ENUM (Set of possible values) programmes works 
&#8594; * ResponseEntity works on 3 types of Statuses
&#8594; * A)Client side errors(4xx)
&#8594; * B)Server side errors(5xx)
&#8594; * C)Success Message(2XX)
</pre>
#### *For this Example there in code HTTPSTATUS.JAVA controller class

# PASS PRIMITTIVE INPUTS
<pre>
&#8594; A) RequestParameter (URL:KEY:VAL) is uses for SPRING-MVC
&#8594; B) @PathVariable(URL/PATH/DATA....) is uses for SPRING[REST+UI]
&#8594; STATICPATH: /path Example:/save./all...etc
&#8594; DYNAMICPATH: /{key}, it indicates a value comes at runtime and binded to this Key
&#8594; /fetch is static path we need to provide same path in client but in case /{id} need to pass one dynamic value
&#8594; This value gets memory in container from there we need to read if in controller using below syntax
&#8594; @Pathvariable("key") DataType localvariable
&#8594; @PathVariable DataType key
&#8594; Notes
&#8594; Note 1: No key is Required while sending the data using Request
&#8594; Note 2: Incase of sending Multiple param order must be followed
&#8594; Note 3: While reading the controller key is required,must specify in URL(Path) as dynamic{key}
&#8594; Note 4: PathVariable are required inputs (not optional) atleast we need to send dummy value
&#8594; C)**** IF two methods are exist with same level one with STATIC and another is DYNAMIC then priority is given to more static count
&#8594; Example :: /find/data ---> M1
&#8594;           /find/{data} ---> M2
&#8594; Req:- Request Always goes to the FirstMethod]
&#8594; This Example code there in Pathvaribale.java class
&#8594; if same URL will be there at controller method level we need to pass in URL,Example code there Pathrun.java class
 </pre>
