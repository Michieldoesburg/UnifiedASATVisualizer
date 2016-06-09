# Contextproject-TSE &nbsp; [![Build Status](https://travis-ci.org/ClintonCao/Contextproject-TSE.svg?branch=master)](https://travis-ci.org/ClintonCao/Contextproject-TSE) [![Coverage Status](https://coveralls.io/repos/github/ClintonCao/Contextproject-TSE/badge.svg?branch=master)](https://coveralls.io/github/ClintonCao/Contextproject-TSE?branch=master) [![MIT license](http://img.shields.io/badge/license-MIT-blue.svg)](http://opensource.org/licenses/MIT)
This is BlueTurtle's repository for Contextproject (TSE) 2015 - 2016.

###About
This tool is for creating a visualization of the warnings/defects that were generated by the _ASATs_ (Automated Static Analysis Tools). With this visualization you can get information about the following things:
* From which _ASAT_ most of the warnings are from.
* From which packages (and also classes) most of the warnings are from.
* From which of the three categories (_Functional Defects_, _Maintainability Defects_ and _Other_) most of the warnings are from. (Please take a look at this [paper](http://www.st.ewi.tudelft.nl/~zaidman/publications/bellerSANER2016.pdf) for more information on the three categories.)

## Team Members:

| Member name |
|-------|
|[Boning Gong] (https://github.com/boninggong)|
|[Clinton Cao] (https://github.com/ClintonCao)|
|[Michiel Doesburg] (https://github.com/Michieldoesburg)|
|[Sunwei Wang] (https://github.com/SunweiWang)|
|[Tim Buckers] (https://github.com/TimBuckers)|
|**SE TA**: [Bastiaan Reijm] (https://github.com/breijm)|


## Links to sprint related documents:

| Document name |   Link                         |
|-------|--------------------------------------|
| Sprint Backlog 1 | [sprint backlog 1] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Plans/SprintBacklog1(BlueTurtle).pdf) |
| Sprint Retrospective 1 | [sprint retrospective 1] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Retrospectives/SprintRetrospective1(BlueTurtle).pdf)|
| Sprint backlog 2 | [sprint backlog 2] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Plans/SprintBacklog2(BlueTurtle).pdf)|
|Sprint Retrospective 2 | [sprint retrospective 2] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Retrospectives/SprintRetrospective2(BlueTurtle).pdf)|
|Sprint Backlog 3 | [sprint backlog 3] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Plans/SprintBacklog3(BlueTurtle).pdf)|
|Sprint Retrospective 3 | [sprint retrospective 3] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Retrospectives/SprintRetrospective3%28BlueTurtle%29.pdf)|
|Sprint Backlog 4 | [sprint backlog 4] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Plans/SprintBacklog4%28BlueTurtle%29.pdf)|
|Sprint Retrospective 4 | [sprint retrospective 4] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Retrospectives/SprintRetrospective4%20%28BlueTurtle%29.pdf)|
|Sprint Backlog 5 | [sprint backlog 5] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Plans/SprintBacklog5%28BlueTurtle%29.pdf)|
|Sprint Retrospective 5 | [sprint retrospective 5] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Retrospectives/SprintRetrospective5(BlueTurtle).pdf)|
|Sprint Backlog 6 | [sprint backlog 6] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Plans/SprintBacklog6(BlueTurtle).pdf)|
|Sprint Retrospective 6 | [sprint retrospective 6] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Retrospectives/SprintRetrospective6(BlueTurtle).pdf)|
|Sprint Backlog 7 | [sprint backlog 7] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Sprint%20Plans/SprintBacklog7(BlueTurtle).pdf)|

## Links to product related documents:

| Document name |   Link                       |
|-------|--------------------------------------|
|Product Planning | [product planning]  (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Product%20related%20documents/ProductPlanningBlueTurtle.pdf)|
|Product Vision | [product vision] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Product%20related%20documents/ProductVisionBlueTurtle.pdf)|
|Architecture Design  | [architecture design] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Product%20related%20documents/ArchitectureDesign(BlueTurtle).pdf)|
|Product Requirement | [product requirement] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/Requirements/RequirementsSoftwareVisualizationToolBlueTurtle.pdf)|
|First Concept  | [first concept] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/First%20Concept/FirstConceptBlueTurtle.pdf) |

## Links to other documents:

ASAT Research: [asat research] (https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/ASAT%20research/StaticanalysistoolsresearchBlueTurtle.pdf)

Maven Execution Research [maven execution research]()

## Link to SIG Feedback 1 (Picture):
SIG Feedback: [SIG Feedback](https://github.com/ClintonCao/Contextproject-TSE/blob/master/documentation/SIG%20Feedback/SIGFeedback.JPG)

## Requirements:
* Java JDK 1.8.
* User must have Maven (IDE plugin or standalone app) installed to run `mvn site`. (For more information, please look at the "Maven Execution Ressearch" document). 
* The project (that is going to be analyzed) must be a Maven Project.

## Running the Program:
* Go to the `src/main/java/BlueTurtle/TSE` folder.
* Run the file `Main.java`.
* Follow the instruction on the User Interface.
* Select the project (on your local machine) that you want to visualize.
* Click the `Visualize` button.
