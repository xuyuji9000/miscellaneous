interface Person{
    firstName: string;
    lastName: string;
}
function greeter(person: Person) {
    return 'Hello' + person.lastName
}

let user = { firstName: 'Jane', lastName: 'user' } 

console.log(greeter(user))
