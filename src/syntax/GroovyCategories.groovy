/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package syntax

/**
 *
 * @author rmoguel
 */

print "Running Categories!"

final class LinesOfCode {
    def number
    String toString() { "${number} lines of code" }
}


@Category(Number)
class NumberCategory {
    LinesOfCode getLinesOfCode() {
        new LinesOfCode(number: this)
    }
}

use(NumberCategory) {
    def dist = 300.linesOfCode

    assert dist instanceof LinesOfCode
    assert dist.toString() == "300 lines of code"
}
