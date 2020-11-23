import com.google.gson.Gson

List<Person> persons  = new ArrayList<>()

persons.add(new Person("Hello", "World", 0))
persons.add(new Person("Hello1", "World1", 1))
persons.add(new Person("Hello2", "World2", 2))
persons.add(new Person("Hello3", "World3", 3))
persons.add(new Person("Hello4", "World4", 4))


Gson gson = new Gson()

String json = gson.toJson(persons)

println(json)