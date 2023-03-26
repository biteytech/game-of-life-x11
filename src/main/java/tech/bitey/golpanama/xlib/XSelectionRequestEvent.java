// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     int type;
 *     unsigned long serial;
 *     int send_event;
 *     Display* display;
 *     Window owner;
 *     Window requestor;
 *     Atom selection;
 *     Atom target;
 *     Atom property;
 *     Time time;
 * };
 * }
 */
public class XSelectionRequestEvent {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("owner"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("requestor"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("selection"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("target"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("property"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("time")
    );
    public static MemoryLayout $LAYOUT() {
        return XSelectionRequestEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XSelectionRequestEvent.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)XSelectionRequestEvent.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        XSelectionRequestEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XSelectionRequestEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XSelectionRequestEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XSelectionRequestEvent.serial$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long serial;
     * }
     */
    public static long serial$get(MemorySegment seg) {
        return (long)XSelectionRequestEvent.serial$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long serial;
     * }
     */
    public static void serial$set(MemorySegment seg, long x) {
        XSelectionRequestEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XSelectionRequestEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XSelectionRequestEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XSelectionRequestEvent.send_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int send_event;
     * }
     */
    public static int send_event$get(MemorySegment seg) {
        return (int)XSelectionRequestEvent.send_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, int x) {
        XSelectionRequestEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XSelectionRequestEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XSelectionRequestEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XSelectionRequestEvent.display$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Display* display;
     * }
     */
    public static MemorySegment display$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)XSelectionRequestEvent.display$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Display* display;
     * }
     */
    public static void display$set(MemorySegment seg, MemorySegment x) {
        XSelectionRequestEvent.display$VH.set(seg, x);
    }
    public static MemorySegment display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)XSelectionRequestEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemorySegment x) {
        XSelectionRequestEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle owner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("owner"));
    public static VarHandle owner$VH() {
        return XSelectionRequestEvent.owner$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window owner;
     * }
     */
    public static long owner$get(MemorySegment seg) {
        return (long)XSelectionRequestEvent.owner$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window owner;
     * }
     */
    public static void owner$set(MemorySegment seg, long x) {
        XSelectionRequestEvent.owner$VH.set(seg, x);
    }
    public static long owner$get(MemorySegment seg, long index) {
        return (long)XSelectionRequestEvent.owner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void owner$set(MemorySegment seg, long index, long x) {
        XSelectionRequestEvent.owner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle requestor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("requestor"));
    public static VarHandle requestor$VH() {
        return XSelectionRequestEvent.requestor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window requestor;
     * }
     */
    public static long requestor$get(MemorySegment seg) {
        return (long)XSelectionRequestEvent.requestor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window requestor;
     * }
     */
    public static void requestor$set(MemorySegment seg, long x) {
        XSelectionRequestEvent.requestor$VH.set(seg, x);
    }
    public static long requestor$get(MemorySegment seg, long index) {
        return (long)XSelectionRequestEvent.requestor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void requestor$set(MemorySegment seg, long index, long x) {
        XSelectionRequestEvent.requestor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle selection$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("selection"));
    public static VarHandle selection$VH() {
        return XSelectionRequestEvent.selection$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Atom selection;
     * }
     */
    public static long selection$get(MemorySegment seg) {
        return (long)XSelectionRequestEvent.selection$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Atom selection;
     * }
     */
    public static void selection$set(MemorySegment seg, long x) {
        XSelectionRequestEvent.selection$VH.set(seg, x);
    }
    public static long selection$get(MemorySegment seg, long index) {
        return (long)XSelectionRequestEvent.selection$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void selection$set(MemorySegment seg, long index, long x) {
        XSelectionRequestEvent.selection$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle target$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("target"));
    public static VarHandle target$VH() {
        return XSelectionRequestEvent.target$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Atom target;
     * }
     */
    public static long target$get(MemorySegment seg) {
        return (long)XSelectionRequestEvent.target$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Atom target;
     * }
     */
    public static void target$set(MemorySegment seg, long x) {
        XSelectionRequestEvent.target$VH.set(seg, x);
    }
    public static long target$get(MemorySegment seg, long index) {
        return (long)XSelectionRequestEvent.target$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void target$set(MemorySegment seg, long index, long x) {
        XSelectionRequestEvent.target$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle property$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("property"));
    public static VarHandle property$VH() {
        return XSelectionRequestEvent.property$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Atom property;
     * }
     */
    public static long property$get(MemorySegment seg) {
        return (long)XSelectionRequestEvent.property$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Atom property;
     * }
     */
    public static void property$set(MemorySegment seg, long x) {
        XSelectionRequestEvent.property$VH.set(seg, x);
    }
    public static long property$get(MemorySegment seg, long index) {
        return (long)XSelectionRequestEvent.property$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void property$set(MemorySegment seg, long index, long x) {
        XSelectionRequestEvent.property$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return XSelectionRequestEvent.time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Time time;
     * }
     */
    public static long time$get(MemorySegment seg) {
        return (long)XSelectionRequestEvent.time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Time time;
     * }
     */
    public static void time$set(MemorySegment seg, long x) {
        XSelectionRequestEvent.time$VH.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)XSelectionRequestEvent.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        XSelectionRequestEvent.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


