using System;

class Program
{
    static void Main()
    {
        double nota1, nota2, nota3, promedio;

        Console.Write("Ingrese la primera nota: ");
        nota1 = Convert.ToDouble(Console.ReadLine());

        Console.Write("Ingrese la segunda nota: ");
        nota2 = Convert.ToDouble(Console.ReadLine());

        Console.Write("Ingrese la tercera nota: ");
        nota3 = Convert.ToDouble(Console.ReadLine());

        promedio = (nota1 + nota2 + nota3) / 3;

        Console.WriteLine("El promedio es: " + promedio);

        if (promedio >= 3.0)
        {
            Console.WriteLine("El estudiante aprueba.");
        }
        else
        {
            Console.WriteLine("El estudiante reprueba.");
        }
    }
}