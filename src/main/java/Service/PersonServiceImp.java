package Service;
        import DTO.PersonDTO;
        import Model.Person;
        import Repository.PersonRepository;
        import com.sqlpractice.dto.PersonDTO;
        import com.sqlpractice.model.Person;
        import com.sqlpractice.repository.PersonRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public String addPerson(PersonDTO personDTO){

        Person person=new Person();
        person.setId(personDTO.getId());
        person.setName(personDTO.getName());
        person.setEmail(personDTO.getEmail());
        person.setMobileNo(personDTO.getMobileNo());

        personRepository.save(person);

        return "Person added Successfully !!!";
    }
}