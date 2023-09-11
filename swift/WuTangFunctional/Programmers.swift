//
//  Programmers.swift
//  WuTangFunctional
//
//  Created by Antti Juustila on 11.9.2023.
//

import Foundation

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

