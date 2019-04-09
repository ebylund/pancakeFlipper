# pancakeFlipper

## How to run
### Using IntelliJ
Best way to run is to download Intellij and run the main function. 
By default, a static set of scenarios will be run and the results output to the console.
the following dataset is what is run by default:

```    
    10
    -
    -+
    +-
    +++
    --+-
    --++-+
    ++--+-
    ------
    ++++-
    --+++--
```
The test cases can be modified directly in the main class by changing the variable `sampleInput` in the `core/src/main/kotlin/com/erikbylund/Main.kt` file with the desired scenarios.
Alternatively, a path to a text file formatted the same as above can be placed as the first program argument.

### From the commandline

The program can also be run from the commandline by created a jar and running that jar in a terminal. run `./gradlew installDist` to install the executable and then, from the project root, run `./core/build/install/core/bin/core /SOME/OPTIONAL/PATH/TO/FILE.txt`

## The Algorithms

There are two algorithms in this repo that solve the problem of how to flip the pancake stack successfully:

### Bottoms up
`bottomUpWithTopMinus` was my initial attempt at solving the problem, but it isn't the optimal solution in some scenarios. This approach finds the deepest upside down pancake and flips the entire stack above it, pancake included. Before it executes the flip, it checks if the top pancake is currently right side up, if it is, it flips it before it flips the whole stack so the current top pancake is right side up when the entire stack is flipped

### Top down
`topDown`is the best algorithm for the job. This simply finds the first pancake that is oriented differently from the top one and flips the entire stack above it so that the next alternate from the top is now lower. It does this until the entire stack is uniform, performing one last flip if the stack is upside before returning. 
