using System;
using System.Linq;
using System.Threading.Tasks;

namespace hellonetcore {
    class Program {
        static void Main(string[] args) {
            Console.WriteLine("Starting!");

            var delay = args?.FirstOrDefault();

            int.TryParse(delay, out int delaySeconds);

            if (delaySeconds < 0)
                delaySeconds = 0;

            while (delaySeconds > 0) {
                var noun = delaySeconds == 1 ? "second" : "seconds";

                Console.WriteLine($"{delaySeconds} {noun} left...");

                Task.Delay(1000).Wait();

                delaySeconds--;
            }

            Console.WriteLine("Complete!");
            Console.WriteLine("Press any key to exit...");

            Console.Read();
        }
    }
}