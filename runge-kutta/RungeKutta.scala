object RungeKutta {
    def main(args: Array[String]) {
        
    }

    def rungeKutta(f_ty: (Double, Double) => Double,
                    y0: Double,
                    stepsize: Double) {
        
    }

    def getNext(f_ty: (Double, Double) => Double, 
                    yn: Double, 
                    tn: Double,
                    stepsize: Double): Double {
        var h = stepsize
        var k1 = h * f_ty(tn, yn)
        var k2 = h * f_ty(tn + h / 2, yn + k1 / 2)
        var k3 = h * f_ty(tn + h / 2, yn + k2 / 2)
        var k4 = h * f_ty(tn + h, yn + k3)

        yn + (1 / 6) * (k1 + 2 * k2 + 2 * k3 + k4)
    }
}