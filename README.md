# Assignment
1. Navigate to multiple pages of the website and automate verification of the header and footer.
2. Automate Newsletter subscription scenarios. The newsletter subscription is placed in the footer.
3. Automate Women > Dresses > Summer Dresses listing page
  * Apply any one available filter and verify the results
  * Apply sorting options - Price and Product name and verify the results
4. Verify the checkout journey by adding any product to the cart.


## About the Framework
* This framework is developement on **Page Object Modal** way via using  Selenium and java Maven.
* 3 source folder available in the project
    |Source Folder|Description|
    | --- | --- |
    |src/main/java| This is for creating base of the project and finding objects with different pages with some utility classes|
    |src/test/java| This package will only use for createing testscripts to run|
    |src/test/resources| If there is any external data or file that need to use this source folder will use for that|
    
    ![image](https://user-images.githubusercontent.com/73033312/96350754-d48c2e80-10d4-11eb-99ab-17664887e646.png)

    
* **TestNG** is being used as testing framework which provided relevant annotations.
* Currently the report is being generated with testng but we can implement extent report
* Currently I didn't include anything for logging but we can integrate log4j jar for logging

# Solution of Assignment
* **Navigate to multiple pages of the website and automate verification of the header and footer.** - Solution1.java
* **Automate Newsletter subscription scenarios. The newsletter subscription is placed in the footer.** - Solution2.java
* **Automate Women > Dresses > Summer Dresses listing page** - Solution3.java
* **Verify the checkout journey by adding any product to the cart.** - Solution4.java


# How to Execute
* Clone this project in local and import to your IDE(Ecliple preferable)
* Wait to download relevant jar from maven repository to local
* Execute **testng,xml** as parallel execute is already implemented in xml file
* See the report as index.html


# Issue Facing
* Not able to perform Filter and Sort by process as application is throwing error as 403 on performing sorting and filter process. See the Image and Video video
 ![image](https://user-images.githubusercontent.com/73033312/96350803-246af580-10d5-11eb-9ef0-6ab2a57b47d4.png)

* Video :-[Forbidden Issue](https://santoshgupta.tinytake.com/tt/NDczNjY1NF8xNDk4NjQxNg)
* Because of above issues I was not able to handle scenario of filter and sorting but able to select the values


**Note:-** I have the knowledge of cypress tool also but didn't worked on real time application but will be able to implement from scratch as it was preferred tool mentioned in assignment

