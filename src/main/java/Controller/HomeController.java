package Controller;

        import DTO.PersonDTO;
        import Service.PersonService;
        import com.sqlpractice.dto.PersonDTO;
        import com.sqlpractice.service.PersonService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private PersonService personService;

    @PostMapping("/addPerson")
    public String addPerson(@RequestBody PersonDTO personDTO){
        return personService.addPerson(personDTO);
    }

}