package com.nc.memberProjects.rest.bdd;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith( Cucumber.class)
@CucumberOptions(features = "src/test/resources/bdd", publish=true)
public class MemberProjectAcceptanceTest{

}
