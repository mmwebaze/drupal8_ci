#!groovy

// vars/testPipeline.groovy

def call (String name) {
    echo "Jenkins job is successful ${name}."
}