using System;
using System.IO;
using Xunit;

using hellonetcore.app;
using System.Linq;

namespace hellonetcore.tests {
    public class ProgramTests {
        [Fact]
        public void Smoketest() {
            RunWithMockedIO();
        }

        [Fact]
        public void NegativeDelayBecomesZero() {
            var output = RunWithMockedIO(-1);

            Assert.DoesNotContain("second", output);
        }

        [Theory]
        [InlineData(0)]
        [InlineData(1)]
        [InlineData(2)]
        public void CorrectCountdown(int input) {
            var output = RunWithMockedIO(input);

            if (input <= 0)
                Assert.DoesNotContain("second", output);

            for (var i = input; i > 0; i--)
                Assert.Contains($"{i} second", output);
        }

        private string RunWithMockedIO(params object[] args) {
            using (var writer = new StringWriter())
            using (var reader = new StringReader("done")) {
                Console.SetOut(writer);
                Console.SetIn(reader);

                Program.Main(args?.Select(x => x.ToString()).ToArray());

                return writer.ToString();
            }
        }
    }
}