jte{
    pipeline_template="package"
}
libraries {
    maven
    nexus
    security
    sonarqube
}

application_environments{
    sit{
        long_name = "System Integration Testing"
        ip_addresses = [ "0.0.0.1", "0.0.0.2" ]
    }
    uat{
        long_name = "User Acceptance Testing"
        ip_addresses = [ "0.0.1.1", "0.0.1.2", "0.0.1.3", "0.0.1.4" ]
    }
}