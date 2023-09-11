//
//  Array+Programmers.swift
//  WuTangFunctional
//
//  Created by Antti Juustila on 11.9.2023.
//

import Foundation

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
