//
//  WuTangNameTestTarget.swift
//  WuTangNameTestTarget
//
//  Created by Antti Juustila on 1.9.2023.
//

import XCTest
import WuTangFunctional

final class WuTangNameTestTarget: XCTestCase {

	override func setUpWithError() throws {
		// Put setup code here. This method is called before the invocation of each test method in the class.
	}

	override func tearDownWithError() throws {
		// Put teardown code here. This method is called after the invocation of each test method in the class.
	}

	func testWuTangNameUniqueness() throws {
		let names =
		[
			"Antti J",
			"Jouni L",
			"Joni R",
			"Kristian H",
			"Pertti K",
			"Markus K",
			"Päivi R-J",
			"Tim C",
			"Bill G"
		]

		let programmers = createProgrammers(for: names).assignWuTangNames()
		XCTAssertEqual(names.count, programmers.them.count, "All names must get programmer names")
		var wuTangNames = Set<String>()
		for programmer in programmers.them where programmer.wutangName != nil {
			let result = wuTangNames.insert(programmer.wutangName!)
			XCTAssertTrue(result.inserted, "\(programmer.wutangName!) not inserted since it is already in use")
		}
		XCTAssertEqual(names.count, wuTangNames.count, "All names must get programmer names")
	}

}
