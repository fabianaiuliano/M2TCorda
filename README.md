# M2T_Corda
README 
Requirements:
- O.S. Windows 10 or future versions
- Install Java 8
- Install Eclipse 4.5.2 
- Install Acceleo 3.7 
- Install SecBPMN2BC https://github.com/MattiaSalnitri/SecBPMN2BC

Disclaimer: all examples have already been generated in the corresponding folder, only the running example (the one we have presented throughout the thesis) has been left for you as a proof of execution (anyway you can even try the other examples, just follow the same steps described below, but first remember to empty their corresponding generation folder otherwise there will be duplicates). 


INSTRUCTIONS:
After making sure you have all the requirements listed above, download the project folder and import it in Eclipse. 
In the 'src' folder, under 'org.eclipse.acceleo.module.sample.main' you will find the generation files (.mtl) and in the 'folderName_X' you will find a bunch of '.secbpmn2bc' examples to be adopted as input for the generation. Such examples have been generated using STS-Tool v.2.2.3, allowing to model SecBPMN2BC processes.  
Proceding, to start your generation you will first run the 'Flow.mtl' file (you can start generating Contracts, States or Security Requirements too, the only constraint is on the flows, being that prior to each genInitFlowX/genRespFlowX you have to run Flow.mtl), which will build the file in which all the classes for the actors involved in the process and which will host all the initiator and responder flow classes. OSS. It is highly recommendable to wait a few between a generation and the other since  in this case the writing happens on the same file. (Se non si rispetta questo threshold viene generato un 'invalid flow' e degli 'invalid Initiator/Responder flow', per ovviare a questo problema di solito banalmente rimuovo il nuovo 'invalid' file generato e le ultime generazioni di classi dai file, riavvio eclipse e runno di nuovo l'mtl per la generazione che avevo intenzione di fare). 

Right clicking on the 'Flow.mtl' file --> Run as --> "Run configurations...", Select the project folder "org.eclipse.acceleo.module.sample", select 'Flow' as main class, select the example (runningexample.secbpmn2BC) you want to try as model and select the target folder associated to such model, already in the project folder under the folder 'task' (e.g. for RoadMisconstruction.secbpmn2bc there's its own RoadMisconstructionGeneration folder. 
Then, iterate the same process for genInitFlowTask (which instantiates the Initiator flows), you'll have to change just the Main class to run from the configurations, since the Target folder is the same (Flows), then the generation code is already configured to write in the files previously generated with Flow.mtl. 
The same hold for  genInitFlowMessageEvents.mtl, genRespFlowTask.mtl, and genRespFlowMessageEvents.mtl. 
After the generation of all the Initiator/Responder classes, run the 'closeBrackets.mtl' file to affix the closing bracket on each java file produced before. 
Then to generate the classes associated to the State Objects, the Contracts and the classes associated to the Security requirements, you just have to change, one at a time, the main class to run, thus States.mtl, Contracts.mtl, and each of the Security properties .mtl files depending on those affixed on the original SecBPMN2BC in the folder 'folder_name...' (you can even try other properties but as a result nothing would be generated if they are not present on the diagram).
