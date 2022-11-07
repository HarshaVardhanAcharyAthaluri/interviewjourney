### JAVA
1. Difference between Comparator and Comparable.
2. How HashMap works internally.
3. Explain about Distributed Database Management.
4. Java 8 features.
5. Difference between Map and FlatMap.
6. Create an Employee object with id,name,department. Then sort Employee based on department. Collect number of employees belonging to same department in to Map, Department as Key value as number of employee. (Reference:Collectors.groupBy(Employee::getDeptName)).
7. Identipodency for GET, POST, PUT, DELETE.
9. Difference between GIT push,pull,fetch.
10. Difference between ArrayList and LinkedList and best places to use.
11. How to change SpringBoot Application properties without restarting Spring Applications.
12. Write a programe which saisfies below.
        I/P -> String s = "aaaabbbccdee"
        O/P -> a4b3c2d1e2.
12. What is weak HashMap.
13. Dependency Injection and IOC.
14. JSTL tags.
15. How we can block to acces of jsp from out side of server directly.
16. What happens to thread when garbage collection kicks of.
17. Which properties can be used for browser sniffing.
18. What is intial quantity of ArrayList.
19. Difference between Transient and Volatile.
20. Diffference between Serializable and Externalizable.
21. Difference between future and completablefeature.
22. Write a programe for LinkedList.
23. Time complexity for ArrayList and LinkedList.
24. What is Difference between String,String Builder,String Buffer.
25. What is Differnec between equals and ==.
26. What are the design steps for an Entity.
27. What are the points consider in creation/Designingn an Entity.
28. What is Hash Collision.
29. Difference between Session and SessionFactoory in Hibernate.
30. What type of queries supplied to @Query annotation.
31. Difference between Error and Exception.
32. Exception Hirearchy.
33. What is Supermost interface in Collection and Collection Hirearchy.
34. How can you run a docker container as non root or sudo user.
35. Producer and Consumer problem.
36. There are 3 Threads.Start the Third Thred either first or second Tread executuin completed.
37. How to make a List as immutable.
38. Create a Immutable class.
39. Binary Search in Java.
40. Reverse a word without any predefined methods Ex: I/P:- "My name is Harsha"  O/P:- "Harsha is name My".
41. By using Java8 feature convert list of strings to integer.
42. Pass list of values into spring rest endpoint(GET/POST).
43. Delete Loop in LinkedList.
44. find the first non repeated char in String.
45. Priority Quee.
46. Explain Merge Sort, Quick Sort.
47. Time Complexity of MergeSort.
48. How do HashTable deal with Hash Collisions.
49. How to Solve Hash Collision.
50. Kth smallest element in unsorted array.
51. Linked HashSet example and difference between HashSet and LinkedHashSet.
52. Is Wrapper class mutable.
53. Explain ThreadPool and Connection Pool.
54. How to compare two objects in Java.
55. Thread safe Collecton.
56. How many ways we can do thread safe (or) How many ways to make a List is thread safe.
57. Explain facade design pattern.
58. Feign client, Circuit Breaker, Fault tollerence.
59. Explain Ribbon.
60. Spring cloud config server and managing multiple instances with spring config server.
61. Multiple instances of same micro service using same spring config server if i do refresf is it effect on all incatnces or any specific instances.  
62. Write programe for blanced braces.
        I/P: -> "[]" -> true
        I/P: -> "{()}" -> true
        I/P: -> "{}[]" -> true
        I/P: -> "[]{" -> false
63. Explain about Transaction Management and Hibernate Transaction Types.
64. Explain about Hibernate Isolations.
65. Explain about Cacading types in Hibernate.
66. Write the program to get follwing output.     
    Input:  String str="uid1:120 , uid2:10 , uid3:20 , uid1:null , uid2:10 , uid3:10, uid4:xyz , uid1:100";
    Output:{uid1=220,uid2=20,uid3=30}
67. Explain about Docker
68. Explain Fail Fast and Fail Safe Iterator.
69. Difference Between Cohesion and Coupling
70. What is Aggregation , Association and Composition? 
71. Difference between inheritance and composition.
72. Convert inputstream to string.
73. What is CountDownLatch.
74. Java CyclicBarrier vs CountDownLatch.
75. What is ThreadPool in Java and How many types of Thread Pools are in java explain about each thread pool.
76. How to create immutable class in java with List object or any Collectiona object.
77. How to create immutable class in java with mutable object.
78. How many types of IOC containers in Spring Framework.
79. Difference between HashMap and ConcurrentHashMap.
80. What is autoproxy in spring/Spring Auto proxy creator example.
81. Spring Boot configure to use two data sources.
82. Explain type of Annotations.
83. What is Http2 and how to enable HTTP2 in Spring Boot.
84. How to upload a file to s3 bucket spring boot.





            
        
### SQL
1. Find the Second highest second salary of Employee.
2. How to get all the data from two tables.
3. What is deffenece between Delete, Drop, Truncate.
4. What is view.
5. Can i drop view.
6. Find the duplicate records.
7. Difference between reqular expression and LIKE operator.
8. Explain indexes in SQL.
9. How we can get modified (or) effected records count in SQL.
10. How to get row count in SQL.
11. Difference between " % " and " _ " operators.
12. Get Manager who reports maximum number of employees.
13. What is meterialized view.
14. List the ID of of manager who is havinng max nuber of reportings.
15. What is Composite key.
16. Difference between PrimaryKey, foreign Key, Unique Key 
17. Create a new empty table from existing table with same columns.

# Angular
1. What are the various ways of Component communications?
2. What do you understand by life cycle hooks of a Component?
4. Which one will be called first, ngOnChange or ngOnInit? Explain with a scenario.
6. Let us say I have a component ABC with a property @Input() foo, and from parent component a same object with changed values is passed to foo. Also, component is set to onPush. In this scenario will ngOnChnages of component get executed?
7. If there are 10 properties with @Input decorator, how will you find out which property is causing ngOnChanges to run?
8. If I use a jQuery calendar control in an Angular app and it has an event selectDate. Can I use these selectDate with Angular event binding? if yes then why and if no then why.
9. What do you understand by ViewChild and ContentChild?
10. Can I read a ViewChild in ngOnInit() life cycle hook? If yes then how?
11. What do you understand by Angular Service?
12. How many objects of a service Angular creates? Can we reconfigure it to create as many objects as we want? how?
13. What is difference between provideIn and providers?
14. When you may need non-tree shakeable service?
15. Can u explain me real use case of useExisting?
16. What do you understand by lazy loaded modules?
17. For a service how many objects Angular creates for lazy loaded modules?
18. Let us say there are three objects a inside that b and inside that C. and there is a service Foo. I have passed Foo in the providers array of component c. Foo is also passed in the providers array of AppModule. How many objects of Foo will be created and inside C component which object will be used?
19. How to dynamically load a component? can you explain me the process?
20. Do Attribute directives have life cycle hooks?
21. What is purpose of @HostBinding
22. What do you understand by Change Detection?
23. When we should use onPush?
24. What is difference between detectChange and markForCheck
24. What do you understand by dumb component and smart component?
26. What is difference between promise and observables
27. What is difference between observable and subjects?
28. What are various types of subjects?
29. When we should use BehaviorSubject?
30. How will integrate API in angular app? best practices?
31. Is it ok to use observable<any> if not why?
32. What is async pipe?
33. What do you understand by union type and intersection type?
34. What is shallow pipe testing?
35. What is purpose of component resolver
36. Can you explain difference between ContentChild and ViewChild
37. When you should use ‘any’ option of provideIn?
38. What do understand by Content Projection?
39. In an app there are 6 lazy loaded module, 9 eagerly loaded module, and one main module. In the app, there is one service called FooService which provideIn option is set to ‘any’. By default, how many objects Angular will create of FooService?
40. What do you understand by partial observer?
41. When we can use ViewProvider?
42. How will you create custom validators for Reactive Forms?
43. Can you explain viewEncapsulationMode?
44. What do you understand by Shadow DOM?
45. What do you understand by tree shakeable providers?
46. Explain various ways of component communications
47. What do you understand by Temp ref variables?
48. How two unrelated components communicate in Angular
49. What do you understand by marble diagrams?
50. When you should use asObservable
51. What is interceptor in Angular
52. What is difference between useValue and useExisting
53. Explain purpose of useValue
