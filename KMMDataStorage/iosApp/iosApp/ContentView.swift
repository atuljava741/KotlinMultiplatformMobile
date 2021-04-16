import SwiftUI
import Foundation
import shared

func getCount() -> Int32 {
    let kmmStorage = KMMStorage(context : NSObject())
    var count = kmmStorage.getInt(key : "count")
    count+=1
    kmmStorage.putInt(key: "count", value: count)
    return count
}

struct ContentView: View {
    @State var counter: Int32 = 0
    var body: some View {
        VStack(spacing: 50) {
            Text(String(counter))
            Button(action: {
                counter  = getCount()
            }) {
                Text("Get Data from User Default")
            }
        }
    }
    
}
struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

