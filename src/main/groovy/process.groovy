import com.google.gson.Gson

String json = """
[{"firstName":"Hello","lastName":"World","age":0},{"firstName":"Hello1","lastName":"World1","age":1},{"firstName":"Hello2","lastName":"World2","age":2},{"firstName":"Hello3","lastName":"World3","age":3},{"firstName":"Hello4","lastName":"World4","age":4}]
"""

Gson gson = new Gson()

List<Person> person = (List<Person>)gson.fromJson(json, ArrayList.class)

person.each { p ->
    println(p.firstName)
}