# This is part of SFG Beer Works 
- a small microservices training application by John Thompson - Spring Framework Guru

# Resources used
- Intellij IDE
- Lombok - annotation processor
    - Lombok annotations - generates constructors, getters, setters, etc. at runtime
    - must enable Annotation Processors in Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors
    
- Axis TCP Mon - monitor plugin
    - useful for seeing what is actually going across the wire between a client and server in HTTP 
        - and not what the browser, application or server is telling you is going across
    - tells you if hidden tokens or headers, useful for debugging when nothing is showing up in standard tools
    - https://plugins.jetbrains.com/plugin/154-axis-tcp-monitor-plugin
    - old but still works