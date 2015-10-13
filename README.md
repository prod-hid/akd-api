# Akademia REST service
This project is the REST searvice repository of Akademia Albania web application.

# Akademia Albania Web (Overview of Development)
The project, in simple words is about providing video and scripted information, in the form of tutorials mostly in Albanian to students/unskilled personas and whoever interested in order to give the people some skill, keep track of how they progress, collaborate with schools and ministry in order to increase motivation to this platform and take over university lectures which are taught in a very non professional way; basically, a video provider of tutorials.

## Development Stack
- Webapp level, using `Angularjs Model-View-Control` architecture https://angularjs.org/
- Template Generation level, using `Jade` (Javascript) http://jade-lang.com/ or `Thymeleaf` (Java) http://www.thymeleaf.org/
- Webservice level, using `Spring RESTful` https://spring.io/guides/gs/rest-service/
- Database level, using `MongoDB` https://www.mongodb.org/

## Database level
- The application requires really low database complexity. It will contain mostly page data and not static small CHAR chunks, that’s why MongoDB seems the most useful and the best in collaborating between all these different technologies, as is generates JSON
- MongoDB is document/page based so it achieves fast query functions on reading and since the writing will be mostly static from our side, there wont be much speed needed.
- The main page structure for the videos, as an idea, could be:
  
  ```json
    {
      "id" : "(generated)",
      "name" : "how to cat",
      "category" : "cat lessons",
      "url" : "http://youtube.com/how_to_cat_file",
      "description" : "this video shows how to cat",
      "rating" : "100 (based on %"
    }
  ```

## Webservice level
- The REST service will be a bridge between the database and the templates which will generate the html pages.
- The REST service will send back information of a video, video-sets and descriptions of video-sections.
- The REST service MUST be able to do searches on YouTube, using the YouTube API.
- The REST service MUST be able to get view count of any video from YouTube in real time.
- Basic implementation of the REST could be based on Spring Framework and accept calls through API, so that it could be extended in the future and have no effects on the web-app, and also it will have different deploy from the web app.

## Template Generation level
- Due to the web application pages being dynamic, dynamic creation of HTML objects is a MUST and the best way to accomplish this would be through templating using Jade (javascript) or Thymeleaf (java). 
- Another needed feature in this step would be the already included client rendering, to remove the weight of templating on the server side and pushing it on the client.
- The Templating service must cooperate with the model view control architecture in order to reach high rendering performance.
- Through MVC model and using templates, we will create views and reuse necessary / redundant views such as footer or header.
- Only the landing page MIGHT not be totally templated due to the need to customize it according to the insights of analytics.

## Webapp MVC level
- Model View Control level delivers best performance for this kind of web application, practically speaking, for dynamic view rendering from the model by using the data provided by the JAVA server.
- Implemented in Angularjs, this architecture will have a mostly static LANDING-PAGE with detail in design and attraction of the eye, a dynamically created body made of sections, classes(as in Courses) and item pages
- The architecture MUST reuse all already created blocks when possible, without creating duplicate code.
- The architecture MUST NOT have any unnecessary complexity which makes it harder for a total reconfiguration/make-over of the application
- The architecture MUST meet the standards of the industry (code reuse, clear documentation, code commenting, clean code of unnecessary libraries) and must not have any areas which are unknown or obscure to the rest of the team.


