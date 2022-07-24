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

##### Example 2::
##### Here Define one public class (Spring boot container should able to access with an annotation @Restcontroller
##### RestController is a Combination of @CONTROLLER + @RESPONSEBODY
##### @Controller supports otocal
##### @ResponseBody return type data is converted into xml and Json format
##### Recommanded Return Type is ResponseEntity, its supports Sending Data,HTTP headers and status information...etc give to consumer
##### RESPONSEENTITY should have basic information like (Response Body and HttpStatus(Enum)
##### ResponseEntity(Body,Status)
