use std::io;

fn leer_nota() -> f64 {
    let mut entrada = String::new();

    io::stdin()
        .read_line(&mut entrada)
        .expect("Error al leer la nota");

    entrada.trim().parse().expect("Debe ingresar un numero")
}

fn main() {
    println!("Ingrese la primera nota:");
    let nota1 = leer_nota();

    println!("Ingrese la segunda nota:");
    let nota2 = leer_nota();

    println!("Ingrese la tercera nota:");
    let nota3 = leer_nota();

    let promedio = (nota1 + nota2 + nota3) / 3.0;

    println!("El promedio es: {}", promedio);

    if promedio >= 3.0 {
        println!("El estudiante aprueba.");
    } else {
        println!("El estudiante reprueba.");
    }
}