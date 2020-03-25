@echo off
@del testresults.txt
@echo ... Testing Ball class ...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing Ball class ...              		>> testresults.txt
echo ======================================  		>> testresults.txt
@java Ball                                   		>> testresults.txt
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt

@echo ... Testing PlaygroundSoccerSim no args...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim no args... 	>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim                       	>> testresults.txt

@echo ... Testing PlaygroundSoccerSim one arg...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim one arg... 	>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10                    	>> testresults.txt

@echo ... Testing PlaygroundSoccerSim two args...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim two args...    >> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10 20                     >> testresults.txt

@echo ... Testing PlaygroundSoccerSim three args...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim three args...  >> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10 20 30                  >> testresults.txt

@echo ... Testing PlaygroundSoccerSim six args...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim six args...    >> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10 20 30 40 50 60         >> testresults.txt

@echo ... Testing PlaygroundSoccerSim negativve time slice...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim negativve time slice...>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10 10  5  5 -1            >> testresults.txt

@echo ... Testing PlaygroundSoccerSim time slice value of zero...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim time slice value of zero...>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10 10  5  5 0.0           >> testresults.txt

@echo ... Testing PlaygroundSoccerSim valid ball should come to rest...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim valid ball should come to rest...>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10 10  1  1               >> testresults.txt

@echo ... Testing PlaygroundSoccerSim check for collision...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim check for collision...>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10 10  1  1 20 20 -1 -1   >> testresults.txt

@echo ... Testing PlaygroundSoccerSim valid ball should go out of bounds...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim valid ball should go out of bounds...>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 10 10 1000 1000           >> testresults.txt

@echo ... Testing PlaygroundSoccerSim valid ball set six balls subsecond time slice...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim valid ball set six balls subsecond time slice...>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 200 200 10 10 100 100 -100 -100 150 150 200 200 175 175 -110 -110 20 20 1 1 50 50 -5 -5 0.1 >> testresults.txt

@echo ... Testing PlaygroundSoccerSim valid ball set five balls 1.234 second time slice...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim valid ball set five balls 1.234 second time slice...>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 200 200 10 10 100 100 -100 -100 150 150 200 200 175 175 -110 -110 20 20 1 1 50 50 -5 -5 1.234  >> testresults.txt

@echo ... Testing PlaygroundSoccerSim valid ball set ten balls 10 second time slice...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... Testing PlaygroundSoccerSim valid ball set ten balls 10 second time slice...>> testresults.txt
echo ======================================  		>> testresults.txt
@java PlaygroundSoccerSim 150 150 10 10 100 100 -100 -100 200 200 200 200 250 250 -110 -110 20 20 1 1 50 50 -5 -5 -100 -100 200 200 -200 -200 300 300 -110 -110 20 20 1 1 50 50 10.0 >> testresults.txt

@echo ... End of PlaygroundSoccerSim Testing ...
echo .                                       		>> testresults.txt
echo .                                       		>> testresults.txt
echo ======================================  		>> testresults.txt
echo ... End of PlaygroundSoccerSim Testing...      >> testresults.txt
echo ======================================  		>> testresults.txt
