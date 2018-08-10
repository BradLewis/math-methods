object RungeKutta {
    def main(args: Array[String]) {
        var f_ty = (t: Double, y: Double) => 2 * t * y
        var stepsize = 0.01
        var y0 = 0.0
        var result = rungeKutta(f_ty, y0, stepsize)
        println(result(10.0))
    }

    def rungeKutta(f_ty: (Double, Double) => Double,
                    y0: Double,
                    stepsize: Double)= (yn: Double) => {
        var y = y0
        var t = 0
        for (i <- 0 to 100) {
            y = getNext(f_ty, y, t, stepsize)
            t = t + stepsize
        }
        y
    }

    def getNext(f_ty: (Double, Double) => Double, 
                    yn: Double, 
                    tn: Double,
                    stepsize: Double) = (y_n1: Double) => {
        var h = stepsize
        var k1 = h * f_ty(tn, yn)
        var k2 = h * f_ty(tn + h / 2, yn + k1 / 2)
        var k3 = h * f_ty(tn + h / 2, yn + k2 / 2)
        var k4 = h * f_ty(tn + h, yn + k3)

        yn + (1 / 6) * (k1 + 2 * k2 + 2 * k3 + k4)
    }
}