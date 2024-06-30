



@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return "Author Added";
    }
    @GetMapping()
    public List<Author> getAuthor(){
        return authorService.getAuthor();
    }
}