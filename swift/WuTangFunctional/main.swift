//
//  main.swift
//  WuTangFunctional
//
//  Created by Antti Juustila on 31.8.2023.
//

import Foundation

struct Programmer {
	let name: String
	let wutangName: String?
}

struct Programmers {
	static let firstNames = [
		"Boolean",
		"Private",
		"Public",
		"Protected",
		"Static",
		"Agnostic",
		"Linear",
		"Parallel",
		"Random",
		"Deterministic"
	]
	static let secondNames = [
		"Process",
		"Thread",
		"Byte",
		"Memory",
		"Drive",
		"Overflow",
		"Underflow",
		"Loop",
		"Packet",
		"Octet",
		"De🪳ger"
	]

	let them: [Programmer]

	static var maxNameCount: Int {
		firstNames.count * secondNames.count
	}
}

func createProgrammers(for names: [String]) -> Programmers {
	var programmers = [Programmer]()
	for name in names {
		programmers.append(Programmer(name: name, wutangName: nil))
	}
	return Programmers(them: programmers)
}

extension Array where Element == Programmer {
	func uniqueWuTangName() -> String {
		var isDuplicate = false
		var name = ""
		repeat {
			isDuplicate = false
			name = Programmers.firstNames.randomElement()! + " " + Programmers.secondNames.randomElement()!
			if contains(where: { $0.wutangName != nil && $0.wutangName == name }) {
				isDuplicate = true
			} else {
				break
			}
		} while isDuplicate
		return name
	}
}

extension Programmers {

	func thenAssignWuTangNames() -> Programmers {
		var programmers = [Programmer]()
		for programmer in self.them {
			programmers.append(Programmer(name: programmer.name, wutangName: programmers.uniqueWuTangName()))
		}
		return Programmers(them: programmers)
	}

	func thenPrint() {
		for (index, programmer) in them.enumerated() {
			Swift.print(
				String(
					format: "%3d. %@ a.k.a %@",
					index + 1,
					programmer.name.padding(toLength: 20, withPad: "_", startingAt: 0),
					programmer.wutangName!
				)
			)
		}
	}
}

func main() {

	let names = ["Antti J", "Jouni L", "Joni R", "Kristian H", "Pertti K", "Markus K", "Päivi R-J", "Tim C", "Bill G"]

	print("Wu-Tang name generator for programmers")
	print("--------------------------------------")
	print("- The generator can produce \(Programmers.maxNameCount) unique names")

	createProgrammers(for: names)
		.thenAssignWuTangNames()
		.thenPrint()
}

main()
