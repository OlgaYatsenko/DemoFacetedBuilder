# Faceted Builder for a complicated objects

## Project Overview and Diagram

Example of a design pattern where a few builders (ChildPersonalInfoBuilder, ChildHomeAddressbuilder) are used for creating a single complicated object (Child). Both ChildPersonalInfoBuilder and ChildHomeAddressbuilder inherit from the ChildBuilder and to each of them a child reference is passed from the parent builder: as a result we can switch between builders in a single API call. 
![alt text](https://github.com/OlgaYatsenko/DemoFacetedBuilder/blob/master/project_diagram.png)
