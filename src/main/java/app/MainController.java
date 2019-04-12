package app;

import app.models.DataDto;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class MainController {

  @RequestMapping("/")
  String home() {
    return "Hello World!";
  }

  @RequestMapping(
    value = "api/getData1",
    method = RequestMethod.GET
  )
  @ResponseBody
  public String getData(

  ) {
    return "";
  }

  @PostMapping(
    value = "/api/getData",
  consumes = "application/json")
  public String getData2(
    @RequestBody DataDto dataDto,
    @RequestParam("appName") String appName
  ) {
    System.out.println("name: "+dataDto.getfName());
    return "here is "+appName+". And here data first list item: ";
  }
}
