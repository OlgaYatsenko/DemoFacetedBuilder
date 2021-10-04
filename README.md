# DemoFacetedBuilder

##Project Overview and Diagram

Example of a design pattern where a few builders (ChildPersonalInfoBuilder, ChildHomeAddressbuilder) are used for creating a single complicated object (Child). hildPersonalInfoBuilder, ChildHomeAddressbuilder inherit from a ChildBuild and toeach of the builder a child reference from parent builder is passed as a result we can switch between builders in a single API call. 
![alt text]()
