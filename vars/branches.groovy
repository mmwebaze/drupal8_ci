#!groovy

import groovy.json.JsonSlurper;

def call () {

    try {

        List<String> params = new ArrayList<String>();
        params.add("None");
        //Getting branches
        //URL apiUrl = "https://api.github.com/repos/mmwebaze/jenkins_demo/branches".toURL();
        //Getting tags
        URL apiUrl = "https://api.github.com/repos/mmwebaze/jenkins_demo/tags".toURL();
        //URL apiUrl = "${repoUrl}".toURL();
        List json = new JsonSlurper().parse(apiUrl.newReader());

        for (repo in json) {

            params.add(repo.name);
        }
        return params;
    }
    catch (IOException ex) {
        print ex;
    }
}