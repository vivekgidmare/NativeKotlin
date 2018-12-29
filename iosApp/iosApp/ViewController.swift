import UIKit
import app

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        let value = Sample().checkMe()
        label.text = Proxy().proxyHello()+String(value)
        
        print("Sample Value:",value)
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    @IBOutlet weak var label: UILabel!
}
