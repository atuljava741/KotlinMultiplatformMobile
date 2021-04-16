import SwiftUI
import shared

struct ContentView: View {
    @State var text : String = ""
    
    func getData() {
        self.text = "Loading Please wait .."
        NetworkCall().getData() {
            result, errror in
            if let result = result {
                self.text = result
            }
        }
    }

    var body: some View {
        Text (self.text).onAppear() {
            getData()
        }
        }
    }

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
