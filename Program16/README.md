# Program 16 – Spring Boot Autowiring, Qualifier and Bean Scope

**Manual reference:** printed pages 16–17 (PDF pages 44–45). These pages are image-only in the uploaded manual, so the source listing could not be transcribed. This folder is a clearly labelled runnable demonstration of the named concepts, not a verbatim copy.

`@Autowired` injects a Spring bean, `@Qualifier` selects one implementation when multiple beans match, and `@Scope("prototype")` requests a new instance from the container. Import the Maven project and run `DemoApplication`.